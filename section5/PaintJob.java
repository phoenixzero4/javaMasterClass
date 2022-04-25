package section5;

/* Solution is Eddies */

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
        // return (int) Math.ceil(((width*height)/areaPerBucket)-extraBuckets);
        int bucketsNeeded = (int) Math.ceil(((width*height)/areaPerBucket)-extraBuckets);
        return (bucketsNeeded < 0 ? 0 : bucketsNeeded);
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
        // return (int) Math.ceil(width*height/areaPerBucket);
       int bucketsNeeded = (int) Math.ceil(width*height/areaPerBucket);
       return (bucketsNeeded < 0 ? 0 : bucketsNeeded);
    }
    
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0) return -1;
        // return (int) Math.ceil(area/areaPerBucket);
        int bucketsNeeded = (int) Math.ceil(area/areaPerBucket);
        return (bucketsNeeded < 0 ? 0 : bucketsNeeded);
    }
}