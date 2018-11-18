import java.util.Collections;
import java.util.HashMap;
import java.awt.event.KeyEvent;
public class KeyMap extends HashMap<Character, Key> {

    public KeyMap(){

        this.put('a', new Key(KeyEvent.VK_A, false));
        this.put('b', new Key(KeyEvent.VK_B, false));
        this.put('c', new Key(KeyEvent.VK_C, false));
        this.put('d', new Key(KeyEvent.VK_D, false));
        this.put('e', new Key(KeyEvent.VK_E, false));
        this.put('f', new Key(KeyEvent.VK_F, false));
        this.put('g', new Key(KeyEvent.VK_G, false));
        this.put('h', new Key(KeyEvent.VK_H, false));
        this.put('i', new Key(KeyEvent.VK_I, false));
        this.put('j', new Key(KeyEvent.VK_J, false));
        this.put('k', new Key(KeyEvent.VK_K, false));
        this.put('l', new Key(KeyEvent.VK_L, false));
        this.put('m', new Key(KeyEvent.VK_M, false));
        this.put('n', new Key(KeyEvent.VK_N, false));
        this.put('o', new Key(KeyEvent.VK_O, false));
        this.put('p', new Key(KeyEvent.VK_P, false));
        this.put('q', new Key(KeyEvent.VK_Q, false));
        this.put('r', new Key(KeyEvent.VK_R, false));
        this.put('s', new Key(KeyEvent.VK_S, false));
        this.put('t', new Key(KeyEvent.VK_T, false));
        this.put('u', new Key(KeyEvent.VK_U, false));
        this.put('v', new Key(KeyEvent.VK_V, false));
        this.put('w', new Key(KeyEvent.VK_W, false));
        this.put('x', new Key(KeyEvent.VK_X, false));
        this.put('y', new Key(KeyEvent.VK_Y, false));
        this.put('z', new Key(KeyEvent.VK_Z, false));

        // Uppercase
        this.put('A', new Key(KeyEvent.VK_A, true));
        this.put('B', new Key(KeyEvent.VK_B, true));
        this.put('C', new Key(KeyEvent.VK_C, true));
        this.put('D', new Key(KeyEvent.VK_D, true));
        this.put('E', new Key(KeyEvent.VK_E, true));
        this.put('F', new Key(KeyEvent.VK_F, true));
        this.put('G', new Key(KeyEvent.VK_G, true));
        this.put('H', new Key(KeyEvent.VK_H, true));
        this.put('I', new Key(KeyEvent.VK_I, true));
        this.put('J', new Key(KeyEvent.VK_J, true));
        this.put('K', new Key(KeyEvent.VK_K, true));
        this.put('L', new Key(KeyEvent.VK_L, true));
        this.put('M', new Key(KeyEvent.VK_M, true));
        this.put('N', new Key(KeyEvent.VK_N, true));
        this.put('O', new Key(KeyEvent.VK_O, true));
        this.put('P', new Key(KeyEvent.VK_P, true));
        this.put('Q', new Key(KeyEvent.VK_Q, true));
        this.put('R', new Key(KeyEvent.VK_R, true));
        this.put('S', new Key(KeyEvent.VK_S, true));
        this.put('T', new Key(KeyEvent.VK_T, true));
        this.put('U', new Key(KeyEvent.VK_U, true));
        this.put('V', new Key(KeyEvent.VK_V, true));
        this.put('W', new Key(KeyEvent.VK_W, true));
        this.put('X', new Key(KeyEvent.VK_X, true));
        this.put('Y', new Key(KeyEvent.VK_Y, true));
        this.put('Z', new Key(KeyEvent.VK_Z, true));

        // Numbers
        this.put('0', new Key(KeyEvent.VK_0, false));
        this.put('1', new Key(KeyEvent.VK_1, false));
        this.put('2', new Key(KeyEvent.VK_2, false));
        this.put('3', new Key(KeyEvent.VK_3, false));
        this.put('4', new Key(KeyEvent.VK_4, false));
        this.put('5', new Key(KeyEvent.VK_5, false));
        this.put('6', new Key(KeyEvent.VK_6, false));
        this.put('7', new Key(KeyEvent.VK_7, false));
        this.put('8', new Key(KeyEvent.VK_8, false));
        this.put('9', new Key(KeyEvent.VK_9, false));

        // Symbols
        this.put('!', new Key(KeyEvent.VK_1, true));
        this.put('@', new Key(KeyEvent.VK_2, true));
        this.put('#', new Key(KeyEvent.VK_3, true));
        this.put('$', new Key(KeyEvent.VK_4, true));
        this.put('%', new Key(KeyEvent.VK_5, true));
        this.put('^', new Key(KeyEvent.VK_6, true));
        this.put('&', new Key(KeyEvent.VK_7, true));
        this.put('*', new Key(KeyEvent.VK_8, true));
        this.put('(', new Key(KeyEvent.VK_9, true));
        this.put(')', new Key(KeyEvent.VK_0, true));
        this.put(' ', new Key(KeyEvent.VK_SPACE, false));

        this.put('?', new Key(KeyEvent.VK_SLASH, true));
        this.put('"', new Key(KeyEvent.VK_QUOTE, true));
        this.put(':', new Key(KeyEvent.VK_SEMICOLON, true));
        this.put(',', new Key(KeyEvent.VK_COMMA, false));


    }

}
