//package com.nc.autumn2020.lesson6Practice;
//
//import com.nc.autumn2020.LessonApi;
//import com.plugin.api.Plugin;
//
//import java.io.File;
//import java.io.FileFilter;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLClassLoader;
//
//public class DynamicClassLoaderExample implements LessonApi {
//
//    @Override
//    public void executeSolution(String[] args) {
//
//        File pluginDir = new File("plugins");
//        FileFilter jarsFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isFile() && pathname.getName().endsWith("jar");
//            }
//        };
//        File[] files = pluginDir.listFiles(jarsFilter);
//
//        for (File file : files) {
//            try {
//                URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{file.toURI().toURL()});
//                Class aClass = urlClassLoader.loadClass("com.ext.plugins.HelloPlugin");
//                Plugin plugin = (Plugin)aClass.newInstance();
//                plugin.invoke();
//
//            } catch (MalformedURLException | ClassNotFoundException |
//                    InstantiationException | IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }
//}