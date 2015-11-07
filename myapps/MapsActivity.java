package com.example.priyanka.myapps;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ZoomButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity{

    private GoogleMap googleMap;
    private Circle mCircle;
    private Marker mMarker;// Might be null if Google Play services APK is not available.
    public static final String NEWS_TYPE = "news_type";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();


    }

    @Override
    protected void onStart() {
        super.onStart();

        googleMap.setMyLocationEnabled(true);



        MarkerOptions myHome = new MarkerOptions();
        myHome.position(new LatLng(12.8700, 74.8800));
        myHome.title("My Home");
        myHome.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE));
        googleMap.addMarker(myHome);

        MarkerOptions federalBank = new MarkerOptions();
        federalBank.position(new LatLng(12.8437814, 75.2479061));
        federalBank.title("Bank");
        federalBank.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        googleMap.addMarker(federalBank);

        MarkerOptions nadhiHills = new MarkerOptions();
        nadhiHills.position(new LatLng(13.3863, 77.7009));
        nadhiHills.title("Nandhi Hills");
        nadhiHills.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        googleMap.addMarker(nadhiHills);

        MarkerOptions LalBagh = new MarkerOptions();
        LalBagh.position(new LatLng(12.9500, 77.5900));
        LalBagh.title("Lal Bagh");
        LalBagh.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        googleMap.addMarker(LalBagh);

        MarkerOptions Iskon = new MarkerOptions();
        Iskon.position(new LatLng(13.0094, 77.5508));
        Iskon.title("Iskon Temple");
        Iskon.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        googleMap.addMarker(Iskon);

        MarkerOptions felight = new MarkerOptions();
        felight.position(new LatLng(12.9200, 77.6100));
        felight.title("Felight");
        felight.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        googleMap.addMarker(felight);
        drawMarkerWithCircle(new LatLng(12.9200, 77.6100));

        googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(getBaseContext(),MapAdressActivity.class);
                switch (marker.getTitle()){
                    case "Bangalore":
                        intent.putExtra(NEWS_TYPE,"https://www.apple.com");
                        startActivity(intent);
                        break;
                    case "Felight":
                        intent.putExtra(NEWS_TYPE,"https://www.apple.com");
                        startActivity(intent);
                        break;
                    case "Iskon Temple":
                        intent.putExtra(NEWS_TYPE,"https://www.apple.com");
                        startActivity(intent);
                        break;
                    case "My Home":
                        intent.putExtra(NEWS_TYPE,"https://www.apple.com");
                        startActivity(intent);
                        break;
                    case "Bank":
                        intent.putExtra(NEWS_TYPE,"https://www.apple.com");
                        startActivity(intent);
                        break;
                    case "Nandhi Hills":
                        intent.putExtra(NEWS_TYPE,"https://www.apple.com");
                        startActivity(intent);
                        break;
                    case "Lal Bagh":
                        intent.putExtra(NEWS_TYPE,"https://www.apple.com");
                        startActivity(intent);
                        break;


                }
                return true;
            }
        });

    }


    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #googleMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (googleMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            googleMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (googleMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #googleMap} is not null.
     */
   private void setUpMap() {

       googleMap.addMarker(new MarkerOptions().position(new LatLng(12.9667, 77.5667))).setTitle("Bangalore");setVisible(true);

       // Move the camera instantly to location with a zoom of 15.
       googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(12.9667, 77.5667), 15));


       // Zoom in, animating the camera.
       googleMap.animateCamera(CameraUpdateFactory.zoomTo(14), 2000, null);

   }

    private void drawMarkerWithCircle(LatLng position){
        double radiusInMeters = 1000.0;
        int strokeColor = 0xffff0000; //red outline
        int shadeColor = 0x44ff0000; //opaque red fill

        CircleOptions circleOptions = new CircleOptions().center(position).radius(radiusInMeters).fillColor(shadeColor).strokeColor(strokeColor).strokeWidth(8);
        mCircle = googleMap.addCircle(circleOptions);

        MarkerOptions markerOptions = new MarkerOptions().position(position);
        mMarker = googleMap.addMarker(markerOptions);
    }

}
