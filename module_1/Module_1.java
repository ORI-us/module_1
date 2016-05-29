/*
Написать программу для сравнения эффективности коллекций:

Программа должна сравнивать различные имплементации коллекций по эффективности выполнения следующих операций:

List

    add(index)
    get(index)
    remove(index)
    contains(value)
    populate (наполнение коллекции)
    ListIterator.add()
    ListIterator.remove()

Set

    add(value)
    remove(value)
    contains(value)
    populate (наполнение коллекции)

 

Сравнения должны выполнятся на объемах: 10К (10 000) 100К 1000К элементов.

Для каждого набора (10К, 100К, 1000К) выполнить не менее 100 измерений и вычислить среднее значение.

Результаты измерений вывести на экран и сохранить в файл в виде таблицы:
 */
package module_1;

import java.io.IOException;

/**
 *
 * @author orius
 */

public class Module_1 {
    /**
     * @param args the command line arguments
     */
 
    static public void main(String[] args) throws IOException
    {
        // TODO code application logic here
        Write_to_File WtF = new Write_to_File();
        
        Test_Collections L0 = new Test_Collections(10);
        String[]    column0 = L0.Get_Column();
        String[][]  row0    = L0.Get_Row();
        SimpleTable T0      = new SimpleTable(column0, row0);
        T0.setVisible( true );
        T0.setTitle("10k");
        T0.setDefaultCloseOperation(T0.DISPOSE_ON_CLOSE); 
        WtF.Write(column0, row0, "10k");
        
        Test_Collections L1 = new Test_Collections(100);
        String[]    column1 = L1.Get_Column();
        String[][]  row1    = L1.Get_Row();
        SimpleTable T1      = new SimpleTable(column1, row1);
        T1.setVisible( true );
        T1.setTitle("100k");
        T1.setDefaultCloseOperation(T1.DISPOSE_ON_CLOSE);
        WtF.Write(column1, row1, "100k");
        
        Test_Collections L2 = new Test_Collections(1000);
        String[]    column2 = L2.Get_Column();
        String[][]  row2    = L2.Get_Row();
        SimpleTable T2      = new SimpleTable(column2, row2);
        T2.setVisible( true );
        T2.setTitle("1000k");
        T2.setDefaultCloseOperation(T2.DISPOSE_ON_CLOSE);
        WtF.Write(column2, row2, "1000k");
        
        WtF.close();
    }
    
}
