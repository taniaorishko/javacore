package center.kit.app.classwork.lesson4;

public class NarrowingCasting2 {
    int int1 = 0;
    float float1 = 3.14159f;

    public void narrowing() {
        int1 = (int) float1;
        System.out.println(int1);
    }

    public class NarrowingCasting3 {
        double double3 = 3.14159d;
        float float3 = 0.0f;

        public void narrowing3() {
            float3 = (float) double3;
            System.out.println(float3)
        }
    }
