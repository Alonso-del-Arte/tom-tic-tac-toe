/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author al
 */
public class TicTacToeTest {
    
    public TicTacToeTest() {
    }

    /**
     * Test of getBoard method, of class TicTacToe.
     */
    @Test
    public void testGetBoard() {
        System.out.println("getBoard");
        TicTacToe instance = new TicTacToe();
        String[][] expResult = null;
        String[][] result = instance.getBoard();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getROWS method, of class TicTacToe.
     */
    @Test
    public void testGetROWS() {
        System.out.println("getROWS");
        TicTacToe instance = new TicTacToe();
        int expResult = 0;
        int result = instance.getROWS();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCOLS method, of class TicTacToe.
     */
    @Test
    public void testGetCOLS() {
        System.out.println("getCOLS");
        TicTacToe instance = new TicTacToe();
        int expResult = 0;
        int result = instance.getCOLS();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBoard method, of class TicTacToe.
     */
    @Test
    public void testCreateBoard() {
        System.out.println("createBoard");
        TicTacToe instance = new TicTacToe();
        instance.createBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBoard method, of class TicTacToe.
     */
    @Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        TicTacToe instance = new TicTacToe();
        instance.printBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeMark method, of class TicTacToe.
     */
    @Test
    public void testPlaceMark() {
        System.out.println("placeMark");
        Integer x = null;
        Integer y = null;
        String player = "";
        TicTacToe instance = new TicTacToe();
        boolean expResult = false;
        boolean result = instance.placeMark(x, y, player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVictory method, of class TicTacToe.
     */
    @Test
    public void testIsVictory() {
        System.out.println("isVictory");
        String player = "";
        TicTacToe instance = new TicTacToe();
        boolean expResult = false;
        boolean result = instance.isVictory(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVictoryRows method, of class TicTacToe.
     */
    @Test
    public void testIsVictoryRows() {
        System.out.println("isVictoryRows");
        String player = "";
        TicTacToe instance = new TicTacToe();
        boolean expResult = false;
        boolean result = instance.isVictoryRows(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVictoryCols method, of class TicTacToe.
     */
    @Test
    public void testIsVictoryCols() {
        System.out.println("isVictoryCols");
        String player = "";
        TicTacToe instance = new TicTacToe();
        boolean expResult = false;
        boolean result = instance.isVictoryCols(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVictoryDiagonal method, of class TicTacToe.
     */
    @Test
    public void testIsVictoryDiagonal() {
        System.out.println("isVictoryDiagonal");
        String player = "";
        TicTacToe instance = new TicTacToe();
        boolean expResult = false;
        boolean result = instance.isVictoryDiagonal(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchPlayer method, of class TicTacToe.
     */
    @Test
    public void testSwitchPlayer() {
        System.out.println("switchPlayer");
        String player = "";
        TicTacToe instance = new TicTacToe();
        String expResult = "";
        String result = instance.switchPlayer(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
