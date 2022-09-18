package test;
import beans.Pelicula;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        
    }
    public static void ActualizarPelicula(int id,String genero) {
        DBConnection con = new DBConnection();
        String Sql ="UPDATEpeliculaSETenero='"+genero+"'WHEREid="+id;
        
        try{
            
        }catch(Exception Ex){
        }
        finally{}
        
        
                
        
    }
}
