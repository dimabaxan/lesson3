
import java.util.*;


     public class   Pharmacy implements Comparable<Pharmacy> {
        private String name;
        private String location;


        public Pharmacy(String name, String location) {
            this.name = name;
            this.location = location;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }


        @Override
        public int compareTo(Pharmacy other){

            int nameComparison = this.name.compareTo(other.name);
            if (nameComparison != 0) {
                return nameComparison;
            }

            return this.location.compareTo(other.location);
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Pharmacy pharmacy = (Pharmacy) obj;
            return Objects.equals(name, pharmacy.name) && Objects.equals(location, pharmacy.location);
        }


        @Override
        public int hashCode() {
            return Objects.hash(name, location);
        }
    }

