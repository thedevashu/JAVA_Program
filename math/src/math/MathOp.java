package math;

public class MathOp {
	
	
		static Number mathAdd(Number a,Number b) {
		Number result = new Number();
		result.setNum(a.getNum() + b.getNum());
		return result;
	    }
		
		static Number mathSub(Number a,Number b) {
			Number result = new Number();
			result.setNum(a.getNum() - b.getNum());
			return result;
		}
		
		static Number mathMul(Number a,Number b) {
			Number result = new Number();
			result.setNum(a.getNum() * b.getNum());
			return result;
		}
}
