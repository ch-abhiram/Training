package DAY10.OOPs.Problems;
class transactions{
    private String name;
    private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

}
class bank{
    private transactions[] trans;
    private String Bname;
    bank(String Bname){
        this.Bname = Bname;
    }
    void helper(String[] name,int[] amount){
        if(trans == null){
            trans = new transactions[name.length];
            for (int i = 0;i<name.length;i++){
                trans[i] = new transactions();
                trans[i].setName(name[i]);
                trans[i].setAmount(amount[i]);
            }

        }
    }
    void display(){
        for(transactions i: trans){
            System.out.println(i.getName()+"  "+i.getAmount());
        }
    }
}
public class PR7 {
    static void main(String[] args) {
        String[] name = {
                "sbi",
                "union",
                "hdfc"
        };
        int[] amount = {
                100,200,300
        };
        bank obj = new bank("icici");
        obj.helper(name,amount);
        obj.display();
    }
}
