/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module_1;

import java.io.*; 
/**
 *
 * @author orius
 */
public class Write_to_File {
    private FileWriter writer;
    public void Write(String[] col, String[][] row, String S)throws IOException
    {
        int size = col.length;
        
        writer.write("\n\t" + S);
        for(int i = 1; i<size; i++)
        {
            writer.write("\n\t" + col[i] + "\n");
            
            if(row[0][i] != null)
                writer.write("ArrayList: "  + row[0][i] + "\n");
            if(row[1][i] != null)
                writer.write("LinkedList: " + row[1][i] + "\n");
            if(row[2][i] != null)
                writer.write("HashSet:    " + row[2][i] + "\n");
            if(row[3][i] != null)
                writer.write("TreeSet:    " + row[3][i] + "\n");
        }
        writer.flush();
    }
    
    public Write_to_File() throws IOException
    {
        File file = new File("Module_1.txt");
        file.createNewFile();
        
        writer = new FileWriter(file);
    }
    
    public void close() throws IOException
    {
        writer.close();
    }
}
