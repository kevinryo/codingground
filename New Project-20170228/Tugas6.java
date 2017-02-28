public class Tugas6{
    
    public void Kelulusan(int nilai){
        
        if(nilai > 60){
            System.out.println("Selamat Anda LULUS");
        }else if(nilai < 60){
            System.out.println("Mohon Ma'af Anda TIDAK LULUS");
        }
        
    }
    
    
    public static void main(String []args){
        
        Tugas6 tgs = new Tugas6();
        tgs.Kelulusan(70);
    
    }
    
    
}