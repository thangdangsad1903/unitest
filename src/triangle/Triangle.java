package triangle;

public class Triangle {
        public static String determineTriangleType(int a, int b, int c) {
            // Kiểm tra điều kiện tam giác không phải là tam giác
            if (a + b <= c || a + c <= b || b + c <= a) {
                return "NotATriangle";
            }

            // Kiểm tra tam giác đều
            if (a == b && b == c) {
                return "Equilateral";
            }

            // Kiểm tra tam giác cân
            if (a == b || b == c || a == c) {
                return "Isosceles";
            }
            // Kiểm tra tam giác vuông
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                return "RightTriangle";
            }
            // Các trường hợp còn lại là tam giác thường
            return "Scalene";
        }
    }

