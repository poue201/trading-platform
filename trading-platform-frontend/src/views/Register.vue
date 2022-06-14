<template>
  <div class="about container-fluid">
    <h1> Login </h1>
  
    <div>
      <form id="registerForm" class="row g-3" action="http://localhost:8080/customer/register" method="POST">
        <div class="col-md-6">
          <div class="form-outline input-border">
            <input type="text" class="form-control" id="validationCustom01" name="firstName" required />
            <label for="validationCustom01" class="form-label">First name</label>
            <div class="valid-feedback">Looks good!</div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-outline input-border">
            <input type="text" class="form-control" id="validationCustom02" name="lastName" required />
            <label for="validationCustom02" class="form-label">Last name</label>
            <div class="valid-feedback">Looks good!</div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-outline input-border">
            <input type="text" class="form-control" id="validationCustom03" name="username" required />
            <label for="validationCustom03" class="form-label">Username</label>
            <div class="invalid-feedback">Please provide a valid Username.</div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-outline input-border">
            <input type="password" class="form-control" id="validationCustom05" name="password" required />
            <label for="validationCustom05" class="form-label">Password</label>
            <div class="invalid-feedback">Please provide a valid password.</div>
          </div>
        </div>
        <div class="col-12">
          <button class="btn btn-primary" type="submit" value="Register">Submit</button>
        </div>
      </form>
    </div>
  </div>
</template>

<script>

</script>
