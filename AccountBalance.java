package Mypack;

class Balance {
    String name;
    float balance1;

    Balance(String s, float f){
        name = s;
        balance1 = f;
    }

        void DisplayShow() {
        if (balance1 < 0) {
            System.out.println("no balance");
        } else if (balance1 > 0) {
            System.out.println("name: " + name);
            System.out.println("balance: " + balance1);
        }
    }
}
class AccountBalance {
    public static void main(String args[]) {
        
        Balance current[] = new Balance[3];
        
        
        current[0] = new Balance("A", 1000.0f);
        current[1] = new Balance("B", 2000.0f);
        current[2] = new Balance("C", -2.0f);

              for (int i = 0; i < current.length; i++) {
            current[i].DisplayShow();        }
    }
}
