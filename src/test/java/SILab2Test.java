import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class SILab2Test {

    @Test
    public void everyStatementTestovi(){

        final SILab2 silab2_objekt = new SILab2();

        List<String> praznalista = new ArrayList<>();

        try {
            silab2_objekt.function(praznalista);
        }
        catch (IllegalArgumentException illegal_argument_exception_objekt){
            assertEquals(illegal_argument_exception_objekt.getMessage(),"List length should be greater than 0"); }

        List<String> nepravilnalista = Arrays.asList("#","#","#");


        try {
            silab2_objekt.function(nepravilnalista);
        }
        catch (IllegalArgumentException illegal_argument_exception_objekt){
            assertEquals(illegal_argument_exception_objekt.getMessage(),"List length should be a perfect square"); }

        List<String> lista1 = Arrays.asList("#","0","#","0");

            System.out.println(Arrays.toString(silab2_objekt.function(lista1).toArray()));
            assertEquals( "objekt[1] != 1","1", silab2_objekt.function(lista1).get(1) );
            assertEquals( "objekt[3] != 1","1", silab2_objekt.function(lista1).get(3) );

        List<String> lista2 = Arrays.asList("#","#","#","0");

            System.out.println(Arrays.toString(silab2_objekt.function(lista2).toArray()));
            assertEquals( "objekt[3] != 2","2", silab2_objekt.function(lista2).get(3) );


        List<String> lista3 = Arrays.asList("0","#","#","#");

        System.out.println(Arrays.toString(silab2_objekt.function(lista3).toArray()));
        assertEquals( "objekt[0] != 2","2", silab2_objekt.function(lista3).get(0) );

        List<String> lista4 = Arrays.asList("#","0","#","#","0","#","#","0","#");

        System.out.println(Arrays.toString(silab2_objekt.function(lista4).toArray()));
        assertEquals( "objekt[1] != 2","2", silab2_objekt.function(lista4).get(1) );
        assertEquals( "objekt[4] != 2","2", silab2_objekt.function(lista4).get(4) );
        assertEquals( "objekt[7] != 2","2", silab2_objekt.function(lista4).get(7) );

    }

    @Test
    public void everyBranchTestovi(){

        final SILab2 silab2_objekt = new SILab2();

        List<String> praznalista = new ArrayList<>();

        try {
            silab2_objekt.function(praznalista);
        }
        catch (IllegalArgumentException illegal_argument_exception_objekt){
            assertEquals(illegal_argument_exception_objekt.getMessage(),"List length should be greater than 0"); }

        List<String> nepravilnalista = Arrays.asList("#","#","#");


        try {
            silab2_objekt.function(nepravilnalista);
        }
        catch (IllegalArgumentException illegal_argument_exception_objekt){
            assertEquals(illegal_argument_exception_objekt.getMessage(),"List length should be a perfect square"); }

        List<String> lista1 = Arrays.asList("#","0","#","0");

        System.out.println(Arrays.toString(silab2_objekt.function(lista1).toArray()));
        assertEquals( "objekt[1] != 1","1", silab2_objekt.function(lista1).get(1) );
        assertEquals( "objekt[3] != 1","1", silab2_objekt.function(lista1).get(3) );

        List<String> lista2 = Arrays.asList("#","#","#","0");

        System.out.println(Arrays.toString(silab2_objekt.function(lista2).toArray()));
        assertEquals( "objekt[3] != 2","2", silab2_objekt.function(lista2).get(3) );


        List<String> lista3 = Arrays.asList("0","#","#","#");

        System.out.println(Arrays.toString(silab2_objekt.function(lista3).toArray()));
        assertEquals( "objekt[0] != 2","2", silab2_objekt.function(lista3).get(0) );

        List<String> lista4 = Arrays.asList("#","0","#","#","0","#","#","0","#");

        System.out.println(Arrays.toString(silab2_objekt.function(lista4).toArray()));
        assertEquals( "objekt[1] != 2","2", silab2_objekt.function(lista4).get(1) );
        assertEquals( "objekt[4] != 2","2", silab2_objekt.function(lista4).get(4) );
        assertEquals( "objekt[7] != 2","2", silab2_objekt.function(lista4).get(7) );

    }

}
