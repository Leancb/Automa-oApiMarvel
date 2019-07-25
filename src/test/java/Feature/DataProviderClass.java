package Feature;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @Test(dataProvider ="getData" )
    public void loginTest(String Uid,String Pwd){
        System.out.println( "User name is "+ Uid);
        System.out.println( "Password is "+ Pwd);
    }

    @DataProvider(name = "getData")
    public Object[][] getData(){
        Object[][] data = new Object[2][2];

        data[0][0] = "FirtUid";
        data[0][1] = "FirtPWD";


        data[1][0] = "SegundoUid";
        data[1][1] = "SegundoPWD";

        return data;
    }

}
