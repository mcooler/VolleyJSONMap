//package onshirt.co.nz.volleyjsonmap;
//
//import android.app.ProgressDialog;
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.android.volley.Request;
//import com.android.volley.RequestQueue;
//import com.android.volley.Response;
//import com.android.volley.VolleyError;
//import com.android.volley.toolbox.StringRequest;
//import com.android.volley.toolbox.Volley;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.util.ArrayList;
//
//public class GeoActivity extends AppCompatActivity {
//    private String URLstring = "https://api.geonet.org.nz/intensity?type=reported&publicID=2013p407387";
//    ArrayList<DataModel> GeoDataModel;
//    private RvAdapter GeoRvAdapter;
//    private RecyclerView recyclerView;
//
//}
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        recyclerView = findViewById(R.id.recycler);
//
//        fetchingJSON();
//
//    }
//
//    private void fetchingJSON() {
//
////        showSimpleProgressDialog(this, "Loading...","Fetching Json",false);
//
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, URLstring,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//
//                        try {
//
////                            removeSimpleProgressDialog();
//
//                            JSONObject obj = new JSONObject(response);
//                            if(obj.optString("status").equals("ok")){
//
//                                GeoDataModel = new ArrayList<>();
//                                JSONArray dataArray  = obj.getJSONArray("features");
//
//                                for (int i = 0; i < dataArray.length(); i++) {
//
//                                    DataModel playerModel = new DataModel();
//                                    JSONObject dataobj = dataArray.getJSONObject(i);
//
//                                    playerModel.setTitle(dataobj.getString("type"));
//                                    playerModel.setAuthor(dataobj.getString("properties"));
//                                    playerModel.setDescription(dataobj.getString("coordinates"));
//
//                                    GeoDataModel.add(playerModel);
//
//                                }
//
//                                setupRecycler();
//
//                            }
//
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        //displaying the error in toast if occurrs
//                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//        // request queue
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//
//        requestQueue.add(stringRequest);
//
//
//    }
//
//    private void setupRecycler(){
//
//        GeoRvAdapter = new RvAdapter(this,GeoDataModel);
//        recyclerView.setAdapter(GeoRvAdapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
//
//    }
//
////    public static void removeSimpleProgressDialog() {
////        try {
////            if (mProgressDialog != null) {
////                if (mProgressDialog.isShowing()) {
////                    mProgressDialog.dismiss();
////                    mProgressDialog = null;
////                }
////            }
////        } catch (IllegalArgumentException ie) {
////            ie.printStackTrace();
////
////        } catch (RuntimeException re) {
////            re.printStackTrace();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////
////    }
//
////    public static void showSimpleProgressDialog(Context context, String title,
////                                                String msg, boolean isCancelable) {
////        try {
////            if (mProgressDialog == null) {
////                mProgressDialog = ProgressDialog.show(context, title, msg);
////                mProgressDialog.setCancelable(isCancelable);
////            }
////
////            if (!mProgressDialog.isShowing()) {
////                mProgressDialog.show();
////            }
////
////        } catch (IllegalArgumentException ie) {
////            ie.printStackTrace();
////        } catch (RuntimeException re) {
////            re.printStackTrace();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
//
//}
//
