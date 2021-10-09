import java.text.NumberFormat;
import java.time.Year;
import java.util.Locale;

public class App {

  public static void main(String[] args) {
    //create variable
    
    double priceGreenChile = 12.99;    
    double pricePosole = 7.50;
    
    double hisMoneyWallet = 32.23;
    double herMoneyWallet = 45.28;
    
    double hisNewMoneyWallet = hisMoneyWallet - priceGreenChile;
    double herNewMoneyWallet = herMoneyWallet - pricePosole;
    
    int hisNumberOfFriends = 250;
    int herNumberOfFriends = 120;
    
    int hisAge = Year.now().getValue() - 1991;
    int herAge = Year.now().getValue() - 1992;
    
    double hisAvgFriendsPerYear = hisNumberOfFriends / hisAge;
    double herAvgFriendsPerYear = herNumberOfFriends / herAge;
      
    String hisFirstName = "Todd";
    String hisMiddleName = "Bennett";
    String hisLastName = "Smith";
    
    String herFirstName = "Alora";
    String herMiddleName = "Rose";
    String herLastName = "Smith";
    
    String hisFullName = hisFirstName + " " + hisMiddleName + " " + hisLastName;
    String herFullName = herFirstName + " " + herMiddleName + " " + herLastName;
    
    Locale locale = new Locale("en", "US");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    
    //print his info
    System.out.println(hisFirstName + "'s wallet decreased from " + currencyFormatter.format(hisMoneyWallet) 
      + " to " + currencyFormatter.format(hisNewMoneyWallet) + " after purchasing bag of green chile.");
    
    System.out.println(herFirstName + "'s wallet decreased from " + currencyFormatter.format(herMoneyWallet) 
      + " to " + currencyFormatter.format(herNewMoneyWallet) + " after purchasing posole.");
    
    System.out.println(hisFullName + " is " + hisAge + " years old. He has " + hisNumberOfFriends + " friends, which means he gained " 
        + hisAvgFriendsPerYear + " friends per year.");
    
    System.out.println(herFullName + " is " + herAge + " years old. She has " + herNumberOfFriends + " friends, which means she gained " 
        + herAvgFriendsPerYear + " friends per year.");
  }

}
