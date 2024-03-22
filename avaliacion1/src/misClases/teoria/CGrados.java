package misClases.teoria;

 class CGrados {

	private float gradosC;
	
	void  CentigradosAsignar(float gC) {
		gradosC = gC;
	}
	
	float FahrenheitObtener() {
		return 9F/5F * gradosC + 32;
	}
	
	float CentigradosObtener() {
		return gradosC;
	}
}
