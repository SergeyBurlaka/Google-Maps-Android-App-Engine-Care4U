package com.quest.uni2b.appengine.gsm.demo.usertouserdemo2svn020316.manager.map.toolbar;

import android.content.SharedPreferences;
import android.view.View;

import com.quest.uni2b.appengine.gsm.demo.usertouserdemo2svn020316.R;
import com.quest.uni2b.appengine.gsm.demo.usertouserdemo2svn020316.gcm.constants.MessageConstant;
import com.quest.uni2b.appengine.gsm.demo.usertouserdemo2svn020316.manager.map.UserMapsActivity;

/**
 * Created by Operator on 21.07.2016.
 */
public class ToolbarGetLocationFail extends Toolbar4Map {


    public ToolbarGetLocationFail(UserMapsActivity context) {
        super(context);
    }

    @Override
    public void createFace() {
        onStopProgressBar();
        defineSpyingItem();
        //setSpyOrStopItemInFailedGetLoc();
        setRadiusFAndNameFViews();
        //itemHelp.setVisible(true);
      //  startIndicateThread();
    }


    @Override
    void setRadiusFAndNameFViews() {
        employeeNameText.setVisibility(View.VISIBLE);
        if (MessageConstant.NO_SPY == getStatus())
        {
        getRadius.setVisibility(View.VISIBLE);
        inputLayoutName.setVisibility(View.VISIBLE);
        }
    }


    @Override
    void setRadiusFAndNameFViews(ToolbarFacesState state) {
    }


    @Override
    public void createFaces(ToolbarFacesState state) {

    }


    @Override
    public void defineSpyingItem() {
        //TODO_done just check status if spy set visible stop or set visible spyItem
        SharedPreferences pref =context.getSharedPreferences(MessageConstant.STATUS_SPY_VIEW, context.MODE_PRIVATE);
        int statusSpy = pref.getInt(employeeSelected,MessageConstant.NO_SPY);

        if (statusSpy == MessageConstant.NO_SPY){
            itemStop.setVisible(false);
            itemSpy.setVisible(true);
            //TODO_ set image  itemSpy
            itemSpy.setIcon(R.mipmap.ic_leye_disable);
            //if(MessageConstant.CLICKED == sharedGetCircle.getInt (MessageConstant.CLICKED_SPY, MessageConstant.DISABLE ))setProgressOnItem ();
        }else{
            itemStop.setVisible(true);
            itemSpy.setVisible(false);
            //TODO_ set image
        }
    }


    @Override
    public void onTransformerToolbar() {
    }


    @Override
    public void startIndicateThread() {

    }
}
