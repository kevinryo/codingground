public class Tugas5{
    
    public void HitungMundur(int angka){
        
        for(int i = angka; i>=0; i--){
            System.out.println(i);
        }
    }
    
    public static void main(String []args){
        
        Tugas5 tgs = new Tugas5();
        tgs.HitungMundur(10);
    
    }
    
    
}