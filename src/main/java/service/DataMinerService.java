package service;

import entity.Company;
import entity.Result;

import java.util.List;

/**
 * Service Class for managing all data mining queries
 */
public class DataMinerService {

    /**
     * Find companies by location
     * @param state
     * @param companies
     * @return result
     */
    public Result locate(String state, List<Company> companies){
        int count=0;
        StringBuilder companyNames = new StringBuilder();

        for(Company company : companies){
            if(company.getState().equals(state)){
                companyNames.append(company.getCompanyName());
                companyNames.append(", ");
                count++;
            }
        }
        deleteLastOccurrence(companyNames,", ");
        log(companyNames,count);
        return new Result(count,companyNames.toString());
    }

    /**
     * Find companies founded before year (inclusive)
     * @param year
     * @param companies
     * @return result
     */
    public Result findBefore(String year, List<Company> companies){
        int count=0;
        StringBuilder companyNames = new StringBuilder();

        for(Company company : companies){
            if(company.getYearFounded()<= Integer.valueOf(year)){
                companyNames.append(company.getCompanyName());
                companyNames.append(", ");
                count++;
            }
        }
        deleteLastOccurrence(companyNames,", ");
        log(companyNames,count);
        return new Result(count,companyNames.toString());
    }

    /**
     * Find companies founded after year (inclusive)
     * @param year
     * @param companies
     * @return result
     */
    public Result findAfter(String year, List<Company> companies){
        int count=0;
        StringBuilder companyNames = new StringBuilder();

        for(Company company : companies){
            if(company.getYearFounded()>= Integer.valueOf(year)){
                companyNames.append(company.getCompanyName());
                companyNames.append(", ");
                count++;
            }
        }
        deleteLastOccurrence(companyNames,", ");
        log(companyNames,count);
        return new Result(count,companyNames.toString());
    }

    /**
     * Find companies with employee size in range
     * @param range
     * @param companies
     * @return result
     */
    public Result findCompaniesBetweenSize(String range, List<Company> companies){
        int count=0;
        StringBuilder companyNames = new StringBuilder();

        for(Company company : companies){
            if(company.getFullTimeEmployees().equals(range)){
                companyNames.append(company.getCompanyName());
                companyNames.append(", ");
                count++;
            }
        }
        deleteLastOccurrence(companyNames, ", ");
        log(companyNames,count);
        return new Result(count,companyNames.toString());

    }

    /**
     * Find companies by categories
     * @param category
     * @param companies
     * @return result
     */
    public Result findType(String category, List<Company> companies){
        int count=0;
        StringBuilder companyNames = new StringBuilder();

        for(Company company : companies){
            if(company.getCompanyCategory().equals(category)){
                companyNames.append(company.getCompanyName());
                companyNames.append(", ");
                count++;
            }
        }
        deleteLastOccurrence(companyNames,", ");
        log(companyNames,count);
        return new Result(count,companyNames.toString());
    }

    /**Utility Methods**/
    private StringBuilder deleteLastOccurrence(StringBuilder input, String delimiter){
        int delimeterLength = delimiter.length();
        if(input!=null && input.length()>delimeterLength) {
            input.setLength(input.length() - delimeterLength);
        }
        return input;
    }
    private void log(StringBuilder companyNames, int companyCount){
        System.out.println("Company Names:");
        if(!companyNames.toString().equals("")) System.out.println(companyNames.toString() + "\n");
        System.out.println("Number of Companies: " + companyCount + "\n");
    }
}
