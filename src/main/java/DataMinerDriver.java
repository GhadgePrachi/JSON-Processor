import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Company;
import org.apache.commons.io.FileUtils;
import service.DataMinerService;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * Driver class that drives application flow by accepting command line argument and appropriately redirecting to corresponding service.
 */
public class DataMinerDriver {
    private static int CONNECT_TIMEOUT = 5000;
    private static int READ_TIMEOUT = 5000;
    private static String FILE_URL = "https://s3-us-west-2.amazonaws.com/bain-coding-challenge/data.json";
    private static String FILE_NAME = "";

    public static void main(String[] args){
        FILE_NAME = args[0];
        String methodName = args[1];
        String methodParameter = args[2];

        DataMinerDriver dataMinerDriver = new DataMinerDriver();
        List<Company> companies = dataMinerDriver.readJsonFromFile();
        dataMinerDriver.executeDataMiningMethods(methodName,methodParameter, companies);
    }

    private void executeDataMiningMethods(String methodName, String methodParameter, List<Company> companies){
        DataMinerService dataMiner = new DataMinerService();

        switch(methodName){
            case "locate" : dataMiner.locate(methodParameter,companies); break;
            case "find_before" : dataMiner.findBefore(methodParameter,companies); break;
            case "find_after" : dataMiner.findAfter(methodParameter,companies); break;
            case "find_companies_between_size" : dataMiner.findCompaniesBetweenSize(methodParameter,companies); break;
            case "find_type" : dataMiner.findType(methodParameter,companies); break;
            default: break;
        }
    }

    private List<Company> readJsonFromFile() {
        try {
            //Create JSON file to store data
            File file = new File(FILE_NAME);

            //Convert JSON File Data to String
            String jsonInput = FileUtils.readFileToString(file, "UTF-8");

            //Creating Object Mapper
            ObjectMapper mapper = new ObjectMapper();

            //Convert String to object
            List<Company> companies = mapper.readValue(jsonInput, new TypeReference<List<Company>>() {
            });

            return companies;
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<Company> readJsonFromURL() {
        try {
            //Create JSON file to store data
            File file = new File(FILE_NAME);

            //Downloading URL content to newly created JSON file
            FileUtils.copyURLToFile(
                    new URL(FILE_URL),
                    file,
                    CONNECT_TIMEOUT,
                    READ_TIMEOUT);

            //Convert JSON File Data to String
            String jsonInput = FileUtils.readFileToString(file, "UTF-8");

            //Creating Object Mapper
            ObjectMapper mapper = new ObjectMapper();

            //Convert String to object
            List<Company> companies = mapper.readValue(jsonInput, new TypeReference<List<Company>>(){});

            return companies;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
