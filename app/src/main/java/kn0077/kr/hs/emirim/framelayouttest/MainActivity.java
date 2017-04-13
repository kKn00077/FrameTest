package kn0077.kr.hs.emirim.framelayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout[] lines=new LinearLayout[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] buts=new Button[3];


        for(int i=0;i<buts.length;i++){
            buts[i]=(Button)findViewById(R.id.but1+i);
            lines[i]=(LinearLayout)findViewById(R.id.line1+i);
            buts[i].setOnClickListener(butHandler);
        }
    }

    View.OnClickListener butHandler=new View.OnClickListener()/*OnClickListener는 인터페이스지만 익명 클래스임으로 한번만 사용할 것이라 implement를 new로 써서 표현함, 다른 클래스를 상속 받을 때에도 똑같이 new로 표현함*/ {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.but1:
                    lines[0].setVisibility(v.VISIBLE);
                    lines[1].setVisibility(v.INVISIBLE);
                    lines[2].setVisibility(v.INVISIBLE);
                    break;

                case R.id.but2:
                    lines[0].setVisibility(v.INVISIBLE);
                    lines[1].setVisibility(v.VISIBLE);
                    lines[2].setVisibility(v.INVISIBLE);
                    break;

                case R.id.but3:
                    lines[0].setVisibility(v.INVISIBLE);
                    lines[1].setVisibility(v.INVISIBLE);
                    lines[2].setVisibility(v.VISIBLE);
                    break;
            }
        }
    };
}
