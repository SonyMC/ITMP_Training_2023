package models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tbl_client_lookup")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
    @Id
    @Column(name = "CoronetClientReference")
    private String coronetClientRef;
    @Column(name = "LC360ClientReference")
    private String lc360ClientRef;
}
