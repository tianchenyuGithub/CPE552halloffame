/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liuyarong caowanying
 */
public class NNMode extends Mode {
    private int n = 5;
    public NNMode() {}
    @Override
    public Shape clickdrag(int x, int y, int x2, int y2) {
        return new NN(x,y,x2,y2,n);
    }
}

