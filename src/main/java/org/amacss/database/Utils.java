package org.amacss.database;

import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;

public class Utils {
  public static ObjectId studentNumberToObjectId(int studentNumber) {
    String postfix = Integer.toString(studentNumber);
    String prefix = StringUtils.repeat("a", 24 - postfix.length());
    System.out.println(prefix + postfix);
    return new ObjectId(prefix + postfix);
  }
  
  public static int objectIdToStudentNumber(ObjectId objectId) {
    return Integer.parseInt(objectId.toString().replaceAll("a", ""));
  }
}
