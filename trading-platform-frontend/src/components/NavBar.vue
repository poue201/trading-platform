<template>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <router-link to="/" class="navbar-brand">Home</router-link>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse pl-5" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <router-link to="/" class="nav-link pointer" data-toggle="collapse" data-target=".navbar-collapse.show">Home</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/login" class="nav-link pointer" data-toggle="collapse" data-target=".navbar-collapse.show">Login</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/register" class="nav-link pointer" data-toggle="collapse" data-target=".navbar-collapse.show">Register</router-link>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script>

export default {
  name: "NavBar",
};
</script>

<style lang="scss" scoped>
  .pointer {cursor: pointer;}
</style>