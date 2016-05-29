/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module_1;

import java.util.*;

/**
 *
 * @author orius
 */

class Test_Collections{
    private String[] columnNames = { "  ",
                                     "populate",         "AddBegin",         "AddMiddle",       "AddEnd", 
                                     "GetBegin_List",    "GetMiddle_List",   "GetEnd_List",     "Conteins",         
                                     "AddIterBegin",     "AddIterMidle",     "AddIterEnd",      "RemoveBeginList",  
                                     "RemoveMiddleList", "RemoveEndList",    "RemoveIterBegin", "RemoveIterMiddle",
                                     "RemoveIterEnd",    "RemoveSet" };
    
    private String[][] rowNames = new String[4][19];
    
    private long Make(Collection Col, int size)
    {
        long startTime = System.currentTimeMillis();  
        for(int i = 0; i < 100*size; i++)
        {
            Col.add(i);
        }

        return System.currentTimeMillis() - startTime;
    }
        
    private long AddBegin_List(List List, int size)
    {
        long startTime = System.currentTimeMillis();  
        for(int i = 0; i < 1000*size; i++)
        {
            List.add(i, i+10);
        }

        return System.currentTimeMillis() - startTime;
    }
            
    private long AddMiddle_List(List List, int size)
    {
        long startTime = System.currentTimeMillis();  
        for(int i = 0, j = 1000*size/4; i < 1000*size; i++)
        {
            List.add(j, i);
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private long AddEnd_List(List List, int size)
    {
        long startTime = System.currentTimeMillis();  
        for(int i = 0; i < 1000*size; i++)
        {
            List.add(i);
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private long GetBegin_List(List List, int size)
    {
        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < 1000*size; i++)
        {
            List.get(i);
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private long GetMiddle_List(List List, int size)
    {
        long startTime = System.currentTimeMillis();        
        for(int i = 1000*size; i < 2000*size; i++)
        {
            List.get(i);
        }

        return System.currentTimeMillis() - startTime;
    }

    private long GetEnd_List(List List, int size)
    {
        long startTime = System.currentTimeMillis();        
        for(int i = List.size() -1 ; i > List.size() - 1000*size; i--)
        {
            List.get(i);
        }

        return System.currentTimeMillis() - startTime;
    }    
    
    private long Contains(Collection Col, int size)
    {
        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < 1000*size; i++)
        {
            Col.contains(i);
        }

        return System.currentTimeMillis() - startTime;
    }
 
    private long RemoveBegin_List(List List, int size)
    {
        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < 1000*size; i++)
        {
            List.remove(0);
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private long RemoveMiddle_List(List List, int size)
    {
        long startTime = System.currentTimeMillis();        
        for(int i = 1000*size, j = 1000*size/4; i < 1000*size; i++)
        {
            List.remove(j);
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private long RemoveEnd_List(List List, int size)
    {
        long startTime = System.currentTimeMillis();        
        for(int i = List.size()-1; i > 1000*size; i--)
        {
            List.remove(i);
        }

        return System.currentTimeMillis() - startTime;
    }
    
    
    private long AddIterBegin(List List, int size)
    {
        ListIterator Iter = List.listIterator();

        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < 1000*size; i++)
        {
            Iter.add(i);
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private long AddIterMidle(List List, int size)
    {
        ListIterator Iter = List.listIterator(1000*size/4);

        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < 1000*size; i++)
        {
            Iter.add(i);
        }

        return System.currentTimeMillis() - startTime;
    }

    private long AddIterEnd(List List, int size)
    {
        ListIterator Iter = List.listIterator(List.size()-1);

        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < 1000*size; i++)
        {
            Iter.add(i);
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private long RemoveIterBegin(List List, int size)
    {
        ListIterator Iter = List.listIterator();

        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < List.size()/6; i++)
        {
            Iter.next();
            Iter.remove();
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private long RemoveIterMidle(List List, int size)
    {
        ListIterator Iter = List.listIterator(List.size()/15);

        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < List.size()/6; i++)
        {
            Iter.next();
            Iter.remove();
        }

        return System.currentTimeMillis() - startTime;
    }

    private long RemoveIterEnd(List List, int size)
    {
        ListIterator Iter = List.listIterator(List.size()-1);

        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < List.size(); i++)
        {
            Iter.previous();
            Iter.remove();
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private long Remove_Hash(Set Hash, int size)
    {
        long startTime = System.currentTimeMillis();        
        for(int i = 0; i < Hash.size(); i++)
        {
            Hash.remove(i);
        }

        return System.currentTimeMillis() - startTime;
    }
    
    private int z;
    private void Print_List(int i, long ATime_Add, long LTime_Add)
    {
        double ATime = (float)ATime_Add/1000.0;
        double LTime = (float)LTime_Add/1000.0;
        
        System.out.println("\nSize :  " + i + "k");
        System.out.println("Array:  " + ATime);
        System.out.println("Linked: " + LTime);
        
        z++;
        
        rowNames[0][z] = Double.toString(ATime);
        rowNames[1][z] = Double.toString(LTime);
    }
    private void Print_Hash(long ATime_Add, long LTime_Add)
    {
        double ATime = (float)ATime_Add/1000.0;
        double LTime = (float)LTime_Add/1000.0;
        
        System.out.println("HashSet:  " + ATime);
        System.out.println("TreeSet: "  + LTime);
        
        rowNames[2][z] = Double.toString(ATime);
        rowNames[3][z] = Double.toString(LTime);
    }
    
    public Test_Collections(int size)
    {
        ArrayList  A_List = new ArrayList(); 
        LinkedList L_List = new LinkedList(); 
        HashSet    H_Set  = new HashSet();
        TreeSet    T_Set  = new TreeSet();
 
        rowNames[0][0] = "ArrayList";
        rowNames[1][0] = "LinkedList";
        rowNames[2][0] = "HashSet";
        rowNames[3][0] = "TreeSet";
        
        z = 0;
        
        int left=size, right=size;
        
        System.out.println("\n\t" + columnNames[1]);
        for(int i = left; i <= right; i*=i)
        {
            A_List.clear();
            L_List.clear();
            H_Set.clear();
            T_Set.clear();
            
            long ATime = Make(A_List, i);
            long LTime = Make(L_List, i);
            long HTime = Make(H_Set,  i);
            long TTime = Make(T_Set,  i);

            Print_List(i, ATime, LTime);
            Print_Hash(HTime, TTime);
        }
        
        System.out.println("\n\t" + columnNames[2]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = AddBegin_List(A_List, i);
            long LTime_Add = AddBegin_List(L_List, i);

            Print_List(i, ATime_Add, LTime_Add);
        }
        
        System.out.println("\n\t" + columnNames[3]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = AddMiddle_List(A_List, i);
            long LTime_Add = AddMiddle_List(L_List, i);

            Print_List(i, ATime_Add, LTime_Add);
        }
        
        System.out.println("\n\t" + columnNames[4]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = AddEnd_List(A_List, i);
            long LTime_Add = AddEnd_List(L_List, i);

            Print_List(i, ATime_Add, LTime_Add);
        }
        
        System.out.println("\n\t" + columnNames[5]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = GetBegin_List(A_List, i);
            long LTime_Add = GetBegin_List(L_List, i);

            Print_List(i, ATime_Add, LTime_Add);
        }
        
        System.out.println("\n\t" + columnNames[6]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = GetMiddle_List(A_List, i);
            long LTime_Add = GetMiddle_List(L_List, i);

            Print_List(i, ATime_Add, LTime_Add);
        }

        System.out.println("\n\t" + columnNames[7]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = GetEnd_List(A_List, i);
            long LTime_Add = GetEnd_List(L_List, i);

            Print_List(i, ATime_Add, LTime_Add);
        }
        
        System.out.println("\n\t" + columnNames[8]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = Contains(A_List, i);
            long LTime_Add = Contains(L_List, i);
            long HTime     = Contains(H_Set,  i);
            long TTime     = Make(T_Set,  i);

            Print_List(i, ATime_Add, LTime_Add);
            Print_Hash(HTime, TTime);
        }
        
        System.out.println("\n\t" + columnNames[9]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = AddIterBegin(A_List, i);
            long LTime_Add = AddIterBegin(L_List, i);

            Print_List(i, ATime_Add, LTime_Add); 
        }
        
        System.out.println("\n\t" + columnNames[10]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = AddIterMidle(A_List, i);
            long LTime_Add = AddIterMidle(L_List, i);

            Print_List(i, ATime_Add, LTime_Add); 
        }
        
        System.out.println("\n\t" + columnNames[11]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = AddIterEnd(A_List, i);
            long LTime_Add = AddIterEnd(L_List, i);

            Print_List(i, ATime_Add, LTime_Add); 
        }
        
        System.out.println("\n\t" + columnNames[12]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = RemoveBegin_List(A_List, i);
            long LTime_Add = RemoveBegin_List(L_List, i);

            Print_List(i, ATime_Add, LTime_Add); 
        }
        
        System.out.println("\n\t" + columnNames[13]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = RemoveMiddle_List(A_List, i);
            long LTime_Add = RemoveMiddle_List(L_List, i);

            Print_List(i, ATime_Add, LTime_Add); 
        }
        
        System.out.println("\n\t" + columnNames[14]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = RemoveEnd_List(A_List, i);
            long LTime_Add = RemoveEnd_List(L_List, i);

            Print_List(i, ATime_Add, LTime_Add); 
        }
        
        System.out.println("\n\t" + columnNames[15]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = RemoveIterBegin(A_List, i);
            long LTime_Add = RemoveIterBegin(L_List, i);

            Print_List(i, ATime_Add, LTime_Add); 
        }
        
        System.out.println("\n\t" + columnNames[16]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = RemoveIterMidle(A_List, i);
            long LTime_Add = RemoveIterMidle(L_List, i);

            Print_List(i, ATime_Add, LTime_Add); 
        }
        
        System.out.println("\n\t" + columnNames[17]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = RemoveIterEnd(A_List, i);
            long LTime_Add = RemoveIterEnd(L_List, i);

            Print_List(i, ATime_Add, LTime_Add); 
        }
        
        System.out.println("\n\t" + columnNames[18]);
        for(int i = left; i <= right; i*=i)
        {
            long ATime_Add = Remove_Hash(H_Set, i);
            long LTime_Add = Remove_Hash(T_Set, i);

            z++;
            Print_Hash(ATime_Add, LTime_Add); 
        }
    }
    
    public String[] Get_Column()
    {
        return columnNames;
    }
    
    public String[][] Get_Row()
    {
        return rowNames;
    }
}
