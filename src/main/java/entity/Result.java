package entity;

/**
 * Entity Result
 */
public class Result {
    int count;
    String companyNames;

    public Result(int count, String companyNames){
        this.count = count;
        this.companyNames = companyNames;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCompanyNames() {
        return companyNames;
    }

    public void setCompanyNames(String companyNames) {
        this.companyNames = companyNames;
    }
}
