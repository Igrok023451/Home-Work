package advance.hw6;

public class Block {
    int[] Size;

    public Block(int[] size) {
        Size = size;
    }

    public int getWidth() {
        return Size[0];
    }

    public int getLength() {
        return Size[1];
    }

    public int getHeight() {
        return Size[2];
    }

    public int getVolume() {
        return Size[0] * Size[1] * Size[2];
    }

    public int getSurfaceArea() {
        int a = 2;
        return ((Size[1] * Size[0] + Size[1] * Size[2] + Size[0] * Size[2]) * a);
    }
}