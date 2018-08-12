import entity.Company;
import entity.Result;
import org.junit.Test;
import service.DataMinerService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DataMinerServiceTest {

    @Test
    public void testLocate(){
        List<Company> companies = createMockCompanyList();
        DataMinerService dataMinerService = new DataMinerService();

        Result result = dataMinerService.locate("CA",companies);
        assertEquals( 2, result.getCount());
        assertEquals("ClearStory Data, AMD", result.getCompanyNames());

        result = dataMinerService.locate("NY", companies);
        assertEquals(0, result.getCount());
    }

    @Test
    public void testFindBefore(){
        List<Company> companies = createMockCompanyList();
        DataMinerService dataMinerService = new DataMinerService();

        Result result = dataMinerService.findBefore("2012",companies);
        assertEquals( 1, result.getCount());
        assertEquals("ClearStory Data", result.getCompanyNames());

        result = dataMinerService.findBefore("2018",companies);
        assertEquals( 2, result.getCount());
        assertEquals("ClearStory Data, AMD", result.getCompanyNames());

        result = dataMinerService.findBefore("2010",companies);
        assertEquals( 0, result.getCount());
        assertEquals("", result.getCompanyNames());
    }

    @Test
    public void testFindAfter(){
        List<Company> companies = createMockCompanyList();
        DataMinerService dataMinerService = new DataMinerService();

        Result result = dataMinerService.findAfter("2012",companies);
        assertEquals( 1, result.getCount());
        assertEquals("AMD", result.getCompanyNames());

        result = dataMinerService.findAfter("2011",companies);
        assertEquals( 2, result.getCount());
        assertEquals("ClearStory Data, AMD", result.getCompanyNames());

        result = dataMinerService.findAfter("2018",companies);
        assertEquals( 0, result.getCount());
        assertEquals("", result.getCompanyNames());
    }

    @Test
    public void testFindCompaniesBetweenSize(){
        List<Company> companies = createMockCompanyList();
        DataMinerService dataMinerService = new DataMinerService();

        Result result = dataMinerService.findCompaniesBetweenSize("1-10",companies);
        assertEquals( 1, result.getCount());
        assertEquals("AMD", result.getCompanyNames());

        result = dataMinerService.findCompaniesBetweenSize("51-200",companies);
        assertEquals( 1, result.getCount());
        assertEquals("ClearStory Data", result.getCompanyNames());

        result = dataMinerService.findCompaniesBetweenSize("5,001-10,000",companies);
        assertEquals( 0, result.getCount());
        assertEquals("", result.getCompanyNames());
    }

    @Test
    public void testFindType(){
        List<Company> companies = createMockCompanyList();
        DataMinerService dataMinerService = new DataMinerService();

        Result result = dataMinerService.findType("Data/Technology",companies);
        assertEquals( 2, result.getCount());
        assertEquals("ClearStory Data, AMD", result.getCompanyNames());

        result = dataMinerService.locate("Healthcare", companies);
        assertEquals(0, result.getCount());
        assertEquals("", result.getCompanyNames());
    }


    /**Utility Methods**/
    public List<Company> createMockCompanyList(){
        ArrayList<Company> companies = new ArrayList<>();

        Company company1 = new Company();
        company1.setCompanyNameId("clearstory-data");
        company1.setCompanyName("ClearStory Data");
        company1.setYearFounded(2011);
        company1.setCity("Palo Alto");
        company1.setState("CA");
        company1.setCountry("us");
        company1.setZipCode(94301);
        company1.setFullTimeEmployees("51-200");
        company1.setCompanyType("Private");
        company1.setCompanyCategory("Data/Technology");
        company1.setRevenueSource("not reported by company");
        company1.setBusinessModel("Business to Business");
        company1.setSocialImpact("");
        company1.setDescription("ClearStory Data is making it easy for business users to find, combine and interactively explore big, diverse data across first-party and third-party sources for immediate insights. The ClearStory Data team has decades of combined experience at Aster Data, Cloudera, Google, Teradata, Oracle, Netscape and Opsware.");
        company1.setDescriptionShort("ClearStory Data makes it easy for business users to find, combine and interactively explore data across first-party and third-party sources.");
        company1.setSourceCount("101+");
        company1.setDataTypes("");
        company1.setExampleUses("");
        company1.setDataImpacts("[]");
        company1.setFinancialInfo("Based in Palo Alto, California, ClearStory Data is backed by Kleiner Perkins Caufield & Byers, Andreessen Horowitz, Google Ventures, Khosla Ventures and notable Silicon Valley industry leaders");
        company1.setLastUpdated("2014-09-25 16:04:12.068179");
        companies.add(company1);

        Company company2 = new Company();
        company2.setCompanyName("AMD");
        company2.setState("CA");
        company2.setYearFounded(2017);
        company2.setFullTimeEmployees("1-10");
        company2.setCompanyCategory("Data/Technology");
        companies.add(company2);

        return companies;
    }

}

