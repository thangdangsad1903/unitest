package nextday;

public class NextDay {
        public static String getNextDate(int day, int month, int year) {
            // Kiểm tra ràng buộc cho các biến day, month, year
            if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2012) {
                return "Invalid input";
            }

            // Xác định số ngày trong tháng
            int daysInMonth;
            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                default:
                    daysInMonth = 31;
                    break;
            }

            // Kiểm tra ngày có hợp lệ hay không
            if (day > daysInMonth) {
                return "Invalid date";
            }

            // Tính toán ngày kế tiếp
            if (day < daysInMonth) {
                day++;
            } else {
                day = 1;
                if (month < 12) {
                    month++;
                } else {
                    month = 1;
                    year++;
                }
            }

            // Trả về ngày kế tiếp dưới dạng chuỗi "dd/mm/yyyy"
            return String.format("%02d/%02d/%04d", day, month, year);
        }

        private static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

