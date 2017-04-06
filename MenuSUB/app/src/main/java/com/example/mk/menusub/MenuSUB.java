package com.example.mk.menusub;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.SubMenu;

public class MenuSUB extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sub);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        SubMenu sub=menu.addSubMenu(R.string.title);
        sub.setIcon(android.R.drawable.ic_menu_search);
        sub.add(0,1,1,R.string.local);
        sub.add(0,2,2,R.string.network);
        return super.onCreateOptionsMenu(menu);
    }
}
