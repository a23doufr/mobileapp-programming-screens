



Added a second activity called MainActivity2 which automatically created xml and java-file
code and contents.
AndroidManifest.xml:
```
  <activity
            android:name=".MainActivity2"
            android:exported="false" />
```

MainActivity2.java includes many changed but this is the main one:
```
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
```
Below is the xml-file for the second activity whcih was also simultaneously created:
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity2">

</androidx.constraintlayout.widget.ConstraintLayout>
```




Bilder läggs i samma mapp som markdown-filen.

![img.png](img.png)


