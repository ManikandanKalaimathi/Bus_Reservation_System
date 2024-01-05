package busResv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int no,boolean ac,int cap)
    {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusNo(){ //accessor method
        return busNo;
    }

    public boolean isAc(){ //accessor method
        return ac;
    }

    public int getCapacity(){ //accessor method
        return capacity;
    }

    public void setAc(boolean val){ //mutator
        ac = val;
    }

    public void setCapacity(int cap){ //mutator
        capacity = cap;
    }

    public void displayBudInfo(){
        System.out.println("Bus No:" + busNo + " Ac:" + ac + " Total Capacity: " + capacity);
    }
    
}
