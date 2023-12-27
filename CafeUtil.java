import java.util.ArrayList;
class CafeUtil {

public int getStreakGoal() {
    int numWeeks = 10; 
    int sum= 0 ;
    for (int i = 1; i <= numWeeks; i++) {
        sum += i;
    }
    return sum;
}
public double getOrderTotal (double[]prices ){
    int total=0;
    for (int i =0; i< prices.length ; i++){
    total += prices[i];
    }
    return total ;
}

public void displayMenu(ArrayList<String> menuItems) {
    for (int i=0; i< menuItems.size() ; i++) {
    String item = menuItems.get(i);
    System.out.println(i+" "+ item);
    }
}

public void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello, " + userName + "!");
    int num = customers.size();
    System.out.println("There are " + num + " people in front of you");
    customers.add(userName);
    System.out.println(customers);
}

public void printPriceChart(String product, double price, int maxQuantity){
    System.out.println(product);
    int j=0;
    for (int i=1; i<=maxQuantity; i++){
        System.out.println(i+" $"+((price*i)-(j*0.5)));
        j++;
    }
}

public void addCustomer() {
    ArrayList<String> customers = new ArrayList<String>();
    String name= "";
    while(!name.equals("q")){
        System.out.println("Please enter the customer name:");
        name = System.console().readLine();
        System.out.println(name);
        customers.add(name);
        System.out.println(customers);
    }
    
}
}