package com.example.practice;

import org.json.JSONArray;
import org.json.JSONException;

import com.example.practice.R;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class fragment_2  extends Fragment implements OnClickListener{
	JSONArray jsonArray;
	private RelativeLayout course;  
	private RelativeLayout found;  
	private RelativeLayout set; 
	private ImageView course_image;  
    private ImageView found_image;  
    private ImageView settings_image;  
    private TextView course_text;  
    private TextView settings_text;  
    private TextView found_text;  
    private int gray = 0xFF7597B3;  
	private int blue =0xFF0AB2FB;  
	private LinearLayout me; 
	View view;	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.layout2, container, false);
		initView(); 
		String msg= (String) getArguments().get("json");
		try 
		{
			jsonArray=new JSONArray(msg);
		} 
		catch (JSONException e)
		{	
			e.printStackTrace();
		}
		TextView txv=(TextView)view.findViewById(R.id.txv);
		txv.setText(parseJson.parseJsonData(jsonArray));
		
		
		return view;
	}
	private void initView() 
	{			
		me=(LinearLayout)view.findViewById(R.id.me);
		course=(RelativeLayout)view.findViewById(R.id.course);
		found=(RelativeLayout)view.findViewById(R.id.found);
		set=(RelativeLayout)view.findViewById(R.id.setting);
		course_image = (ImageView)view.findViewById(R.id.course_image_a);  
        found_image = (ImageView)view.findViewById(R.id.found_image_b);  
        settings_image = (ImageView)view.findViewById(R.id.setting_image_c);  
        course_text = (TextView)view.findViewById(R.id.course_text_a);  
        found_text = (TextView)view.findViewById(R.id.found_text_b);  
        settings_text = (TextView)view.findViewById(R.id.setting_text_c);  
		course.setOnClickListener(this);
		found.setOnClickListener(this);
		set.setOnClickListener(this);	
		me.getBackground().setAlpha(200);

	}
	@Override
	public void onClick(View v) {
		 switch (v.getId()) 
		 {
		 	case R.id.course:  
	            setTabSelection(0);
	           Toast.makeText(getActivity(),"�ڬO001��", Toast.LENGTH_SHORT).show();
	            break;  
	        case R.id.found:  
	            setTabSelection(1);
	            Toast.makeText(getActivity(),"�ڬO002��", Toast.LENGTH_SHORT).show();
	            break;  
	        case R.id.setting:  
	            setTabSelection(2);
	            Toast.makeText(getActivity(),"�ڬO003��", Toast.LENGTH_SHORT).show();
	            break;  
	      	  
	        default:  
	            break;  
		 }
		
	}
	
	private void setTabSelection(int i) {
		
        resetBtn();       
        switch (i)  
        {  
        case 0:  
           
        	course_image.setImageResource(R.drawable.a); 
        	//course.setBackgroundColor(R.drawable.ic_tabbar_bg_click);
        	course_text.setTextColor(blue);
            break;  
        case 1:  
          
        	found_image.setImageResource(R.drawable.b); 
        	//found.setBackgroundColor(R.drawable.ic_tabbar_bg_click);
        	found_text.setTextColor(blue); 
            break;  
        case 2:  
           
        	settings_image.setImageResource(R.drawable.c);  
        	//set.setBackgroundColor(R.drawable.ic_tabbar_bg_click);
        	settings_text.setTextColor(blue);  
            break; 
            
        default:  
            break; 
        }     
		
	}
	private void resetBtn() {
		course_image.setImageResource(R.drawable.d);  
        //course.setBackgroundColor(R.drawable.bottom_bar);  
        course_text.setTextColor(gray);  
        found_image.setImageResource(R.drawable.e);  
        //found.setBackgroundColor(R.drawable.bottom_bar);  
        found_text.setTextColor(gray);  
        settings_image.setImageResource(R.drawable.f);  
        //set.setBackgroundColor(R.drawable.bottom_bar);  
        settings_text.setTextColor(gray);  
	}
	

}
