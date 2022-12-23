package POMcombintOfTnP;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class TS_1  extends Base_class
{
	@Test(dataProvider = "signupdata",dataProviderClass = DataProviderClass.class)
	
		public void signup(String fn,String ln,String mail,String pass)
		{
			Pom_class pmc  = new Pom_class(driver);
			pmc.reg_link();
			pmc.gender();
			pmc.firstname(fn);
			pmc.lastname(ln);
			pmc.mail(mail);
			pmc.password(pass);
			pmc.con_pass(pass);
			pmc.regbtn();
			
			
		}
	}


