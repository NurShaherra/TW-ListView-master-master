package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15031777 on 14/6/2017.
 */

public class Module {
    private String module;
    private boolean prog;
    public Module(String module, boolean prog) {
        this.module = module;
        this.prog = prog;
    }
    public String getModule() {
        return module;
    }
    public boolean isProg() {
        return prog;
    }

}
