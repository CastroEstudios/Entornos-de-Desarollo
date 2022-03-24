package practica1junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Test;

class MiClaseTest {

    @Test
    public void prueba1(){
        MiClase prueba = new MiClase();
        int []ArrayN = {4,3,1,2};
        int []expResult = {1,2,3,4};
        int []result = prueba.burbuja(ArrayN);
        assertEquals(Arrays.toString(expResult), Arrays.toString(result));
    }
    
    @Test
    public void prueba2(){
        MiClase prueba = new MiClase();
        int []ArrayN = {8,1,0,2,5,4};
        int []expResult = {0,1,2,4,5,8};
        int []result = prueba.burbuja(ArrayN);
        assertEquals(Arrays.toString(expResult), Arrays.toString(result));
    }
    
    @Test
    public void prueba3(){
        MiClase prueba = new MiClase();
        int []ArrayN = {-50,80,0,0,120,-150};
        int []expResult = {-150,-50,0,0,80,120};
        int []result = prueba.burbuja(ArrayN);
        assertEquals(Arrays.toString(expResult), Arrays.toString(result));
    }
    
    @Test
    public void prueba4(){
        MiClase prueba = new MiClase();
        int []ArrayN = {-50,80,0,0,1200,-1150};
        int []expResult = {-1150,-50,0,0,80,1200};
        int []result = prueba.burbuja(ArrayN);
        assertEquals(Arrays.toString(expResult), Arrays.toString(result));
    }
    
    @Test
    public void prueba5(){
        MiClase prueba = new MiClase();
        int []ArrayN = {-20,54,3,-1};
        int []expResult = {-20,-1,3,54};
        int []result = prueba.burbuja(ArrayN);
        assertEquals(Arrays.toString(expResult), Arrays.toString(result));
    }
}