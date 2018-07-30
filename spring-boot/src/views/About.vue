<template>
   <div>
        <button type="button" class="btn btn-primary" @click="click">getUser</button>
        <input type="file" name="file" @change="upload($event)">
   </div>
</template>

<script>
import http from "../utils/http.js";
export default {
  name: "About",
  components: {},
  data() {
    return {};
  },
  methods: {
    click: function() {
      http
        .get("/api/user/get/1")
        .then(function(response) {
          console.log(response);
        })
        .catch(function(error) {
          console.log(error);
        });
    },
    upload: function(e) {
      let file = e.target.files[0];
      let param = new FormData();
      param.append("file", file);
      http
        .upload("/api/file/upload", param)
        .then(function(response) {
          console.log(response);
        })
        .catch(function(error) {
          console.log(error);
        });
    }
  }
};
</script>

<style scoped>
</style>

