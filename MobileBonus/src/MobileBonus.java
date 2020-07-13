public class MobileBonus {
    public static void main(String[] args) {
        int clientaccount= 100;
        int deposit =1100;
        int sumresult;
        if (deposit>1000){
            int bonus= deposit / 100;
            sumresult=clientaccount+deposit+bonus;
        }
        else {
            sumresult=clientaccount+deposit;
        }
        System.out.println(sumresult);
    }
}
