/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba2.pkg22141094;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class logic {
    private File file = null;
    private int txtCount =0;
    private int javaCount=0;
    private int pdfCount=0;
    private int otherCount=0;
    
    
    private List<String> resultados = new ArrayList<>();
    
    
    public void setFile (String ruta){
        file=new File(ruta);
    }
    
    
    public File getFile(){
        return file;
    }
    
    
    public boolean isValid(){
        if(file==null)return false;
        return file.exists()&&file.isDirectory();
    }
    
    public void limpiar(){
        txtCount =0;
        javaCount=0;
        pdfCount=0;
        otherCount=0;
        resultados.clear();
    }
    
    
    public void contarPorTipo(File dir){
        File[] contenido = dir.listFiles();
        
        if(contenido==null) return;
        
        for (File item : contenido) {
            if(item.isDirectory()){
                contarPorTipo(item);
            }else if(item.isFile()){
            }
            
        }
    }
    
    
    
}
