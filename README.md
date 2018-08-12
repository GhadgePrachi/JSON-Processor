# JSON-Processor

## Design overview :
    DataMinerDriver.java : Accepts the inputs from the user and calls the services accordingly
    DataMinerService.java : Handles all the queries
    Result.java :  Store result of service methods containing list of companies and count
    Company.java : Entity Model for mapping JSON content

## Install instructions :
    Download and clone the project from Github
    Import and Setup project as a maven project
    Build instructions : Run DataMinerDriver.java as java application and pass the command line parameters as required
                         Example : DataMinerDriver data.json locate CA

## Assumptions
    1)The input file 'data.json' is hosted inside the application. The parameter file name is used to load the hosted file.
    2)DataMinerService method find_companies_between_size() will look for exact range match (E.g Given Parameter '1-5000' will be counting elements with range '1-5000' only and will ignore cases like  '11-20', '201-500' etc)

## Testing
    DataMinerServiceTest : Test cases using JUnit Framework

## Future Improvements
    Add end to end functional testing
