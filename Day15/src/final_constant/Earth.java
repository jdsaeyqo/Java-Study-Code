package final_constant;

public class Earth {
	
	public static final double EARTH_RADIOUS = 6400;
	public static final double EARTH_SURFACE_AREA ;
	
	static {
		EARTH_SURFACE_AREA = 4* EARTH_RADIOUS * EARTH_RADIOUS * Math.PI;
	}
	
	public static void main(String[] args) {
		
		System.out.println("지구의 반지름 : "+Earth.EARTH_RADIOUS+"km");
		System.out.println("지구의 표면적 : "+Earth.EARTH_RADIOUS+"km^2");
	}

}
