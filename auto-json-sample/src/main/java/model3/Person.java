package model3;

import auto.json.AutoJson;
import android.os.Parcelable;
import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;
import model1.HeightBucket;
import model2.Address;

@AutoJson
public abstract class Person implements Parcelable {
  public static Person create(String name, long id, HeightBucket heightType, Map<String, Address> addresses,
      List<Person> friends, Bitmap bitmap) {
    return new AutoJson_Person(name, id, heightType, addresses, friends, bitmap);
  }

  public abstract String name();
  public abstract long id();
  public abstract HeightBucket heightType();
  public abstract Map<String, Address> addresses();
  public abstract List<Person> friends();
  public abstract Bitmap bitmap();
}
