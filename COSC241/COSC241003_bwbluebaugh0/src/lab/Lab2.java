/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import collection.*;

/**
 *
 * @author bwbluebaugh0
 */
public class Lab2 {
    
    public static  void test()
            {
                
                
                MyVector testVector = new MyVector();
                
                int d = 0, e = 1, f;
                for(int i = 3; i <= 32; ++i)
                {
                    f = d;
                    d = e;
                    e = f + e;
                    
                    testVector.append(f);
                }
                
                
                
                System.out.println(testVector.toString());
                    
                
                testVector.reverse();
                
                
                MyVector cloneTest;
                
                
                cloneTest = testVector.clone();
                
                
                testVector.toString();
                
                
                cloneTest.reverse();
                
                
                cloneTest.toString();
                
                
                testVector.merge(cloneTest);
                
                
                System.out.println(testVector.toString());
}
}
