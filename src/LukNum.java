public class LukNum {

    private int num;
    private int ord;


    public LukNum(int num, int ord){
        this.ord = ord;
        this.num = num;
    }

    public int GetNum(){
        return num;
    }
    public int GetOrd(){
        return ord;
    }
    public void setNum(int num){
        this.num = num;
    }
    public void setOrd(int ord){
        this.ord = ord;
    }
}
