module com.github.akramov.bd {
    requires sqlite.jdbc;
    requires java.sql;
    requires transitive com.github.akramov.common;
    exports db;
}
