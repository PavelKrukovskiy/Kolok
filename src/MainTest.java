import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.Assert.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void fact(){
        assertEquals(120, Main.fact(5));
        assertEquals(720, Main.fact(6));
        assertEquals(1, Main.fact(0));
    }


    @org.junit.jupiter.api.Test
    void first_n_fact() {
        int[] mas=new int[5];
        Main.first_n_fact(5,mas);
        assertEquals(mas, Main.first_n_fact(5,new int[5]));
    }
}