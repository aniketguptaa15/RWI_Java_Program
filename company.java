class Encapusulation {
    private int empid;
    public void setEmpid( int eid){
     empid= eid;
    }
    public int getEmpid(){
      return empid;
    }
}

public class company {
    public static void main(String[] args) {
        Encapusulation E= new Encapusulation();
        E.setEmpid(101);
        System.out.println(E.getEmpid());
    }
    
}
