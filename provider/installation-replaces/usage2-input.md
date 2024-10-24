Usage:
  ```hcl
     filters {
       filter_type = "Include"
       name = "Sample Include"
       regexp = ".*\\d{16}.*"
     }
     filters {
       filter_type = "Mask"
       name = "Sample Mask"
       regexp = "(\\d{16})"
       mask = "MaskedID"
     }
  ```  