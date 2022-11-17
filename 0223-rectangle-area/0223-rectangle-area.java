class Solution {
public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

    int a = (ax2-ax1) *(ay2-ay1);
    int b=  (bx2-bx1) *(by2-by1);
    int width = Math.min(ax2,bx2) - Math.max(ax1,bx1);
    int height = Math.min(ay2,by2) - Math.max(ay1,by1);
    int rect = width*height;
    int sum = a+b-rect;
    if(width >0 && height>0)
    {     
    return sum;
    }
    else
    {
        return a+b;
    }
 
}
}